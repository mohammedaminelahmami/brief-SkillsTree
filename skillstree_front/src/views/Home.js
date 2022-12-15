import React, { useState } from 'react'
import { useQuery } from 'react-query';
import Navbar from '../components/Navbar'
import axios from 'axios';
import User from '../components/User';
import ActivityIndicator from 'react-activity-indicator'
import undraw1 from "../assets/imgs/undraw1.png"
import Modal from "../components/Modal";

const Home = () => {

  const [isOpen, setIsOpen] = useState(false);
  const [obj, setObj] = useState({});

  const clickHandler = (apprenant)=>{
    setObj({
            id: apprenant.id,
            nom: apprenant.nom,
            prenom: apprenant.prenom,
            email: apprenant.email,
            password: apprenant.password,
            img: apprenant.img
          })
    setIsOpen(true);
  }

  const getAllApprenants = async ()=>{
    let response = await axios.get(`http://localhost:8080/api/apprenant/getAllApprenants`);
    return response.data;
  }

  const {data, status} = useQuery("getAllApprenants", getAllApprenants);

  if(status === "loading")
  {
    return(
      <div className="centerAbsoluteDiv">
        <ActivityIndicator
          number={5}
          diameter={40}
          borderWidth={1}
          duration={5}
          activeColor="#1d4ed8"
          borderColor="white"
          borderRadius="50%"
        />
      </div>
      )
  }

  if(status === "error")
  {
    return <h1>Error...</h1>
  }

  return (
    <>
      <Navbar />
      <div className="flex justify-center w-full">
        <div className="flex justify-center items-center flex-wrap gap-16 mt-24" style={{width: "65%"}}>
          {
            data.map((apprenant, index)=>{
              return(
                <button onClick={()=>clickHandler(apprenant)} key={index}>
                  <User apprenant={apprenant} />
                </button>
              );
            })
          }
        </div>
      </div>

      <Modal
        stateModal={isOpen}
        onClose={()=>{setIsOpen(false)}}
        apprenant={obj}
      />

      <div className="xl:absolute xl:top-96 xl:left-12 xl:mt-72 xl:-z-30">
        <img src={undraw1} width="500" height="500" />
      </div>
    </>
  )
}

export default Home