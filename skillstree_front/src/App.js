import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from "./views/login";
import Home from './views/Home';
import { QueryClientProvider, QueryClient } from "react-query";

const queryClient = new QueryClient();

function App() {

  return (
    <QueryClientProvider client={queryClient}>
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
    </QueryClientProvider>
  );
}

export default App;