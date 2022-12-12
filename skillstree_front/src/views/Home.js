import React from 'react'
import Navbar from '../components/Navbar'
import User from '../components/User'
import undraw1 from "../assets/imgs/undraw1.png"

const Home = () => {
  return (
    <>
    <Navbar />
    <div className="flex flex-col gap-10 mt-36">      
      <div className="flex justify-center gap-20">  
        <User />
        <User />
        <User />
        <User />
        <User />
        <User />
      </div>

      <div className="flex justify-center gap-20">
        <User />
        <User />
        <User />
        <User />
      </div>

      <div className="flex justify-center gap-20">
        <User />
        <User />
        <User />
      </div>

      <div className="flex justify-center gap-20">
        <User />
        <User />
      </div>

      <div className="absolute top-96 left-12 mt-72">
        <img src={undraw1} width="500" height="500" />
      </div>
    </div>
    </>
  )
}

export default Home