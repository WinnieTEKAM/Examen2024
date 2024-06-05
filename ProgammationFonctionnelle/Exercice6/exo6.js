const killcount=(counselers, intelligenceJason)=> {
    return counselers
        .filter(([nom, intelligence]) => intelligence < intelligenceJason)
        .map(([nom, intelligence]) => nom);
}


console.log(killcount([['Tiffany',4],['Jack',6],['Megan',7],['Tyler',3]],6) );  
