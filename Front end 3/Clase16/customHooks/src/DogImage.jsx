import useFetch from "./useFetch";

function DogImage(){

    const {data, loading, error} = useFetch("https://dog.ceo/api/breeds/image/random/5")

    if(loading){
        return <div>Cargando...</div>
    }

    if(error){
        return <div>Error: {error.message}</div>
    }

    return(
        <div>
            <h2>Imagenes de perros</h2>
            <div>
                {data.message.map((url,index)=>(
                    <img key={index}  src={url} alt="" width={"300px"} />
                ))}
            </div>
        </div>

    )

}

export default DogImage;