import React, { useContext } from "react";
import Form from "../Components/Form";
import { ContextGlobal } from "../Components/utils/global.context";

const Contact = () => {
  const { state } = useContext(ContextGlobal);
  const theme = state.theme;

  return (
    <div >
      <h2>Quisieras mas información?</h2>
      <p>Envianos tus datos y nos pondremos en contacto</p>
      <Form />
    </div>
  );
};

export default Contact;
