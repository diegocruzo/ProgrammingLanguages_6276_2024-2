factorial :: Int -> Int
factorial 0 = 1
factorial n = n * factorial(n - 1)

crearListaOpt :: Int -> [Int] -> [Int]
crearListaOpt x y =
    if x == 0
        then y
    else
        crearListaOpt z (z:y)
        where z = x - 1

-- Función anónima (abstracción o forma lambda)
filtrarParesLista :: [Int] -> [Int]
filtrarParesLista = filter (\x -> mod x 2 == 0) -- Entre paréntesis se encuentra la forma lambda

duplicarLista :: [Int] -> [Int]
duplicarLista = map (*2)

incrementarLista :: [Int] -> [Int]
incrementarLista = map succ

-- Operador de composición (.)
combinar = incrementarLista . duplicarLista . filtrarParesLista

-- Función que recibe un parámetro y otorga más de un parámetro en la salida
listaUnValor x = x []

generarLista = listaUnValor . crearListaOpt


lista = [1..7]


main :: IO()
main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    c <- readLn :: IO Int
    putStrLn("a = " ++ show(a))
    putStrLn("b = " ++ show(b))
    putStrLn("c = " ++ show(c))
    let num = a 
    putStrLn("factorial " ++ show(num) ++ " = " ++ show(factorial num))
    putStrLn("crearLista " ++ show(num) ++ " [] = " ++ show(crearListaOpt num []))
    putStrLn("filtrarParesLista " ++ show(lista) ++ " = " ++ show(filtrarParesLista lista))
    putStrLn("duplicarLista " ++ show(lista) ++ " = " ++ show(duplicarLista lista))
    putStrLn("incrementarLista " ++ show(lista) ++ " = " ++ show(incrementarLista lista))
    putStrLn("combinar " ++ show(lista) ++ " = " ++ show(combinar lista))
    putStrLn("generarLista " ++ show(num) ++ " = " ++ show(generarLista num))
