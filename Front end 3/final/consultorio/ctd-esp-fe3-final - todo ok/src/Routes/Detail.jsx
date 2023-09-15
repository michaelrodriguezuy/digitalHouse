
import axios from "axios";
import { useContext, useEffect, useState } from "react";
import { useParams } from "react-router-dom";

import { ContextGlobal } from "../Components/utils/global.context";

const Detail = () => {
  
  const [dentist, setDentist] = useState(undefined);
  const params = useParams();

  const { state } = useContext(ContextGlobal);
  const theme = state.theme;

  useEffect(() => {
    axios.get(`https://jsonplaceholder.typicode.com/users/${params.id}`)
      .then((response) => {        
        setDentist(response.data);
      });
  }, [params]);

  return (
    <div className={`${theme}`}>
      <h1>Datos del dentista</h1>
            
      <table >
        <thead>
          <tr >
            <th>Nombre</th>
            <th>Email</th>
            <th>Telefono</th>
            <th>Sitio web</th>
          </tr>
        </thead>
        <tbody>                              
          <tr> 
            <td>{dentist?.name}</td>
            <td>{dentist?.email}</td>
            <td>{dentist?.phone}</td>
            <td>{dentist?.website}</td>
          </tr>
        </tbody>
      </table>

    </div>
  );
};

export default Detail;
