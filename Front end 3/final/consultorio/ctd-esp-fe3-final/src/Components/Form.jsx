import { useState } from "react";

const Form = () => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  const [error, setError] = useState(false);
  const [datosEnviados, setDatosEnviados] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();

    if (name.length <= 5 || email.length === 0) {
      setError("Por favor verifique su información nuevamente");
      setDatosEnviados(false);
    } else {
      setDatosEnviados(
        `Gracias ${name}, te contactaremos cuanto antes vía mail`
      );
      console.log(`Nombre: ${name} Email: ${email}`);

      setName("");
      setEmail("");
      setError(false);
    }
  };

  return (
    <>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="name"
          id="name"
          placeholder="Nombre completo"
          value={name}
          onChange={(e) => setName(e.target.value)}
          style={{ margin: "0.5em", width: "20em" }}
        />

        <input
          type="email"
          name="email"
          id="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          style={{ margin: "0.5em", width: "20em" }}
        />

        <button className="button-form" type="submit">
          Enviar
        </button>
      </form>

      {error ? <h4>{error}</h4> : null}
      {datosEnviados ? <h3>{datosEnviados}</h3> : null}
    </>
  );
};

export default Form;
