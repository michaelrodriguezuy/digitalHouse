import React from 'react'
import ReactDOM from 'react-dom/client'
import Memo from './Memo.jsx'
import Callback from './Callback.jsx'
import './index.css'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <Memo />
   <Callback/>
  </React.StrictMode>,
)
