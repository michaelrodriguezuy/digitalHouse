import { useReducer,useEffect } from "react";

function fetchReducer(state,action){
    switch (action.type){
        case "FETCH_INIT":
            return {...state,loading:true,error:null};
        case "FETCH_SUCESS":
            return {...state,loading:false,data: action.payload};
        case "FETCH_FAILURE":
            return {...state,loading:false,error:action.payload};
        }
    }

function useFetch(url){
    const initialState={
        data:null,
        loading:true,
        error:null
    }

    const [state,dispatch]=useReducer(fetchReducer,initialState);

    useEffect(()=>{
        dispatch({type:"FETCH_INIT"});

        fetch(url)
            .then((response)=>{
                if(!response.ok){
                    throw new Error("Error en la respuesta");
                }
                return response.json();
            })
            .then((result)=>{
                dispatch({type:"FETCH_SUCESS",payload:result});
            })
            .catch((error)=>{
                dispatch({type:"FETCH_FAILURE",payload:error});
            })
    },[url])

    return state
}

export default useFetch;