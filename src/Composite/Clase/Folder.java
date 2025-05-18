package Composite.Clase;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    String name;
    List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item){
        if(!children.contains(item)){
            children.add(item);
        }
    }
    @Override
    public void print(String indent) {
        System.out.println(indent + name);
        for(FileSystemItem item : children){
            item.print(indent + "  ");
        }
    }

    @Override
    public double getSize() {
        double totalSize = 0;
        for(FileSystemItem item : children){
            totalSize = item.getSize();
        }
        return totalSize;
    }
}
