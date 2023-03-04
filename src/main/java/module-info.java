module org.zx.rect3d.rect3dcore {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.zx.rect3d.rect3dcore to javafx.fxml;
    exports org.zx.rect3d.rect3dcore;
}