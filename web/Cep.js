/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function init(){
    
    let xhr = new XMLHttpRequest();
    let cep = document.querySelector("input[name=cep]").value;
   
    xhr.onreadystatechange = function(){
        if(xhr.readyState === 4 && xhr.status === 200){
     
            let tagsXML = ["cep","logradouro","complemento","bairro","localidade","uf","unidade","ibge","gia"]; 
            
            tagsXML.forEach((item)=>{
                let cell = document.querySelector("#" + item);
                let cepXML = xhr.responseXML.getElementsByTagName(item)[0].textContent;
    
                 cell.textContent = cepXML;
            });
            
        }
    };
    
    xhr.open("get",`https://viacep.com.br/ws/${cep}/xml`, true);
    xhr.send();
    
    
}

function registerEvents(){
    
    let botao = document.querySelector("input[name=botao]");
    botao.onclick = init;
}


onload = registerEvents;


