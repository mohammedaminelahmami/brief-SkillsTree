import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from "./views/login";
import Home from './views/Home';

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route index element={
          <Login />
        }/>

        <Route path="/home" element={
          <Home />
        }/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;