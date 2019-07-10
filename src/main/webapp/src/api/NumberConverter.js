import axios from 'axios';

const OPTIONS_API = '/api/conversions';


export const number_converter_options = () => {
    const headers = {
        'Access-Control-Allow-Origin' : '*',
        'Access-Control-Allow-Methods' : 'GET',
      }
      return axios.get(OPTIONS_API);
}

export const convert_number = (from, to, value) => {
  //should return error if any of these is empty
    const headers = {
        'Access-Control-Allow-Origin' : '*',
        'Access-Control-Allow-Methods' : 'GET',
      }
    var endpoint = `/api/convert/${from}/${value}/${to}`;
    return axios.get(endpoint);
}