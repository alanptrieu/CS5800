public class FileDriver{
    public static void main(String[] args){
        /*
        demo1
            Source Files
                .phalcon
                app
                    config
                    controllers
                    library
                    migrations
                    models
                    views
                 cache
                 public
                 .htaccess
                 .htrouter.php
                 index.html
            Index Path
            Remote Files
         */
        Folder demo1 = new Folder("demo1");
            Folder sourceFiles = new Folder("Source Files");
            demo1.addSubFolder(sourceFiles);
                Folder phalcon = new Folder(".phalcon");
                sourceFiles.addSubFolder(phalcon);
                Folder app = new Folder("app");
                sourceFiles.addSubFolder(app);
                    Folder config = new Folder("config");
                    app.addSubFolder(config);
                    Folder controllers = new Folder("controllers");
                    app.addSubFolder(controllers);
                    Folder library = new Folder("library");
                    app.addSubFolder(library);
                    Folder migrations = new Folder("migrations");
                    app.addSubFolder(migrations);
                    Folder models = new Folder("models");
                    app.addSubFolder(models);
                    Folder views = new Folder("views");
                    app. addSubFolder(views);
                Folder cache = new Folder("cache");
                sourceFiles.addSubFolder(cache);
                Folder publicFolder = new Folder("public");
                sourceFiles.addSubFolder(publicFolder);
                File htaccess = new File(".htacess");
                sourceFiles.addFile(htaccess);
                File htrouter = new File(".htrouter.php");
                sourceFiles.addFile(htrouter);
                File index = new File("index.html");
                sourceFiles.addFile(index);
            Folder includePath = new Folder("Include Path");
            demo1.addSubFolder(includePath);
            File remoteFiles = new File("Remote Files");
            demo1.addFile(remoteFiles);

            demo1.print();
            sourceFiles.removeSubFolder("app");
            demo1.print();
            sourceFiles.removeSubFolder("public");
            demo1.print();
    }
}
