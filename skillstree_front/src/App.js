import './App.css';
import {useEffect, useMemo} from "react";
import axios from "axios";
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import TestView from "./views/TestView";

function App() {

  useMemo(()=>{
    axios.get("http://localhost:8080/api/v1/getAll")
      .then(res=>{
          console.log(res)
      })
      .catch(error=>{
          console.log(error)
      })
  }, [])

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={
          <Home />
        }/>
        
        <Route path="/test" element={
          <TestView />
        }/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;