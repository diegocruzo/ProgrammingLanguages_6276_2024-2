-- Función promedio
promedio :: Fractional a => a -> a -> a -> a
promedio x y z = (x + y + z) / 3

-- Función sumaMonedas
sumaMonedas :: Num a => a -> a -> a -> a
sumaMonedas x y z = (x * 200) + (y * 500) + (z * 1000)

-- Función ultimaCifra
ultimaCifra :: Integral a => a -> a
ultimaCifra x = rem x 10

-- Función aproximar
aproximar :: (RealFrac a, Integral b) => a -> a -> a -> b
aproximar x y z = round (promedio x y z)


-- Función principal
main :: IO()
main = do
    -- Obtener un valor desde consola
    a <- readLn :: IO Float -- Obtenemos un valor entero
    b <- readLn :: IO Float
    c <- readLn :: IO Float
    d <- readLn :: IO Integer
    putStrLn "Funciones: "
    putStrLn $ "a = " ++ show(a)
    putStrLn $ "b = " ++ show(b)
    putStrLn $ "c = " ++ show(c)
    putStrLn $ "promedio: " ++ show(promedio a b c)
    putStrLn $ "sumaMonedas: $" ++ show(sumaMonedas a b c)
    putStrLn $ "ultimaCifra: " ++ show (ultimaCifra d)
    putStrLn $ "aproximar: " ++ show(aproximar a b c)
    
    