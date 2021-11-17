/*
    1) Write two functions:
        - One to retrieve all unique substrings that start and end with a vowel.
        - One to retrieve all unique substrings that start and end with a consonant.
    The resulting array should be sorted in lexicographic ascending order (same order as a dictionary).
    Examples:
        getVowelSubstrings("apple")
        --> ["a", "apple", "e"]

        getVowelSubstrings("hmm") --> []

        getConsonantSubstrings("aviation")
        --> ["n", "t", "tion", "v", "viat", "viation"]

        getConsonantSubstrings("motor")
        -->["m", "mot", "motor", "r", "t", "tor"]

        Notes:
            - Remember the output array should have unique values.
            - The word itself counts as a potential substring.
            - Exclude the empty string when outputting the array.
*/
function getVowelSubstrings(word){
    var array = [];
    var y,z;
    var counter=0;
    for(let i=0; i<word.length;i++){
        var x=word.substring(i,i+1);
        if(x=="a"||x=="e"||x=="i"||x=="o"||x=="u"){

            if(counter==0){
                array.push(x);
                y=i;
                counter++;
            }
            else if(counter==1){
                z=i;
                array.push(word.substring(y,z+1));
                array.push(x);
                return array;
            }
        }

    }return array;
}

function getConsonantSubstrings(word){
    var array = [];
    var y,z;
    var counter=0;
    var dub=0;
    
    for(let i=0; i<word.length;i++){
        var x=word.substring(i,i+1);
        if(x!="a"&&x!="e"&&x!="i"&&x!="o"&&x!="u"){
            if(counter==0){
                y=i;
                counter++;
                if(dub==0){
                  array.push(x);
                  dub++;
                }
                
            }
            else if(counter==1){
                z=i;
                array.push(word.substring(y,z+1));
                array.push(x);
                counter=0;
                i=i-1;
                if(dub==1){
                    dub=0;
                }
                dub=1;
            }

        }
    }
    for(let j=0;j<word.length;j++){
       var c =word.length;
    a =word.substring(j,j+1);
    b = word.substring(c,c-1);
    if(a!="a"&&a!="e"&&a!="i"&&a!="o"&&a!="u"&&b!="a"&&b!="e"&&b!="i"&&b!="o"&&b!="u"){
        
        array.push(word.substring(j,c));
        break;
    } 
    }
    
    array.sort();
    return array;
}




console.log(getVowelSubstrings("apple"));
console.log(getVowelSubstrings("hmm"));

console.log(getConsonantSubstrings("aviation"));
console.log(getConsonantSubstrings("motor"));