const calculateTip=(montantTotal,avis)=>{
    const pourboire={
        'terrible': 0,
        'poor': 5,
        'good': 10,
        'great': 15,
        'excellent': 20,       
    };
    
    avis=avis.toLowerCase();

    if (avis in pourboire){

        const pourPourcen=pourboire[avis];
        const somme= Math.ceil((montantTotal*pourPourcen)/100);
        return somme;
    }else{
        return "Rating not recognised";
    }

}
console.log(calculateTip(20, "ExcellEnt"))
console.log(calculateTip(26.95, "goOd"))
console.log(calculateTip(20,"hi"))