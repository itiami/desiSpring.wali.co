
function title() {
    document.addEventListener("DOMContentLoaded", function() {
        var myDataElement = document.getElementById('myData');
        var myData = myDataElement.dataset.myattribute;
        const jsonArr = JSON.parse(myData);
        jsonArr.map(el=>{
            console.log(el)
            /*console.log({
                name: el.name,
                path: el.path
            })*/
        })
    });
}

//title();

async function fetOsInfo_FromSpring(){
    const os = document.getElementById('os');
   const response =  await  fetch("http://localhost:3010/tuto/env")
        .then(data=>{
            return data.json();
        })
        .catch(err=>{
            return err;
        })

     Object.entries(response).forEach((dt,index)=>{
            let li =  document.createElement("li");
            li.innerText = (index+1) + ". " + dt;
            os.appendChild(li);
     })

    console.log(response)
    return response;
}

fetOsInfo_FromSpring();