import React, { useState, useCallback } from 'react';

function ChildComponent({ onClick }) {
  return <button onClick={onClick}>Haz clic</button>;
}

function Callback() {
  const [count, setCount] = useState(0);

  // Utilizamos useCallback para memorizar la función onClick
  const handleClick = useCallback(() => {
    console.log('Hiciste click');
    setCount(count + 1);
  }, [count]); // La dependencia es 'count'

  return (
    <div className="App">
      <h1>Ejemplo UseCallback</h1>
      <p>Conteo: {count}</p>
      <ChildComponent onClick={handleClick} />
    </div>
  );
}

export default Callback;
