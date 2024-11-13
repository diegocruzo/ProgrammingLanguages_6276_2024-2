-- Importar bibliotecas de datos
import System.IO
import Data.List (isInfixOf)


main :: IO()
main = do
    -- Abrir un archivo en modo lectura
    repo <- openFile "datos.txt" ReadMode
    
    -- Extraer todas las líneas del archivo
    contenido <- hGetContents repo
    
    -- Dividir el contenido en líneas
    let lineasDelArchivo = lines contenido -- lineasDelArchivo es un arreglo de cadenas.
    
    -- Filtrar las líneas que contienen la palabra "Edad"
    let lineasFiltradas = filter (isInfixOf "Edad") lineasDelArchivo
    
    -- Mostrar las líneas filtadas
    putStrLn("Líneas que contienen la palabra 'Edad':")
    mapM_ putStrLn lineasFiltradas

    -- Cerrar el archivo
    hClose repo
    
    -- Abrir un archivo nuevo en modo escritura
    repo2 <- openFile "datos2.txt" WriteMode

    -- Escribir las líneas filtradas en el nuevo arvchivo
    mapM_ (hPutStrLn repo2) lineasFiltradas
    
    hClose repo2
    
    
    
    