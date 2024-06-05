 const convertirNiveauxDeGris=(image) =>{
    return image.map(ligne =>
        ligne.map(pixel => {
            const valMoyenne = Math.round((pixel[0] + pixel[1] + pixel[2]) / 3);
            return [valMoyenne, valMoyenne, valMoyenne];
        })
    );
}


console.log(convertirNiveauxDeGris([
    [[123, 231, 12], [56, 43, 124]],
    [[78, 152, 76], [64, 132, 200]]
]));






