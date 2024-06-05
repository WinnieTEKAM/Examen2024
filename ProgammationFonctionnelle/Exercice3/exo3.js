const  longestWord=(chaine)=> {
    const mots = chaine.split(" ");
    mots.sort((a, b) => b.length - a.length);
    return mots[0]; 
}


console.log(longestWord('a b c d e fgh')); 

console.log(longestWord('one two three')); 

console.log(longestWord('red blue grey'));