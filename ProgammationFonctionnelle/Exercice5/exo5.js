const carreDesNombres=(nombre)=> {
    
    const NombreChaine = nombre.toString();
    
    
    const chiffres = NombreChaine.split('');
    
    const chiffresCarres = chiffres.map(chiffre => {
        const num = parseInt(chiffre);
        return (num * num).toString();
    });
    
    
    const resultat = chiffresCarres.join('');
    
  
    return parseInt(resultat);
}


console.log(carreDesNombres(9119));  