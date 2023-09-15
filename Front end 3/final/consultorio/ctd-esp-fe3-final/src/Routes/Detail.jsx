import { useContext } from "react";
import { useParams } from "react-router-dom";

import { ContextGlobal } from "../Components/utils/global.context";

const Detail = () => {  
  const {id} = useParams();

  const { state, data } = useContext(ContextGlobal);
  const theme = state.theme;
  const dentistas = data.getData;

  const dentist = Array.isArray(dentistas) ? dentistas.find((dentista) => dentista.id === parseInt(id)) : null;

  return (
    <div >
      <h1>Datos del dentista {id}</h1>
      <table>
        <thead>
          <tr>
            <th>Nombre</th>
            <th>Email</th>
            <th>Telefono</th>
            <th>Sitio web</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>{dentist ? dentist.name : ""}</td>
            <td>{dentist ? dentist.email : ""}</td>
            <td>{dentist ? dentist.phone : ""}</td>
            <td>{dentist ? dentist.website : ""}</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default Detail;
