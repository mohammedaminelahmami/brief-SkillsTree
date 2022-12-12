import axios from "axios";

export const getAll = async (endpoint)=>
{
    let response = await axios.get(`http://localhost:8080/api/v1/${endpoint}`);
    return response.data;
}