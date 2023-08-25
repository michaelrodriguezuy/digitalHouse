import React, { useMemo, useState } from 'react';

function Memo() {
  const [numero, setNumero] = useState(10);

  // Utilizamos useMemo para calcular el cuadrado de 'numero'
  const cuadrado = useMemo(() => {
    console.log('Cálculo del cuadrado');
    return numero * numero;
  }, [numero]); // La dependencia es 'numero'

  return (
    <div className="App">
      <h1>Ejemplo UseMemo</h1>
      <p>Número: {numero}</p>
      <p>Cuadrado: {cuadrado}</p>
      <button onClick={() => setNumero(numero + 1)}>Incrementar</button>
    </div>
  );
}

export default Memo;
