1. создаем на диске d папку temp
2. скачайте проект Library с https://github.com/norka1989/library/tree/second-branch  в эту папку

3. заходим в проектную директорию (туда, куда был скачан проект)
например, 
cd D:\temp

4. создаём папку target
mkdir target

5. компилируем все проектные файлы в папку target
javac -cp src/ src/Library/StartUp.java -d ./target/

6. создаем jar файл
jar cvfm Library.jar ./MANIFEST.MF -C ./target/ .  (если не прописана classpath, то перед этим вставить в ковычках путь к файлу jar.exe)

7. запускаем созданный jar
java -jar ./Library.jar
