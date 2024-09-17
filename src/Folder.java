import java.util.ArrayList;
import java.util.List;
public class Folder{
    private String folderName;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String folderName){
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }
    public String getFolderName(){
        return folderName;
    }
    public void setFolderName(String folderName){
        this.folderName = folderName;
    }
    public void addFile(File file){
        files.add(file);
    }
    public void addSubFolder(Folder folder){
        subFolders.add(folder);
    }
    public void removeSubFolder(String folderName){
        for (int i = 0; i < subFolders.size(); i++){
            if (subFolders.get(i).getFolderName().equals(folderName)){
                subFolders.remove(i);
                break;
            }
        }
    }
    public void print(String indent){
        System.out.println(indent + folderName);
        for (int i = 0; i < subFolders.size(); i++){
            subFolders.get(i).print(indent + "  ");
        }
        for (int i = 0; i < files.size(); i++){
            files.get(i).print(indent + "  ");
        }
    }
    public void print(){
        print("");
    }
}
