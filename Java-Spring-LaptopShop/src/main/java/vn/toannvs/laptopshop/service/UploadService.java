package vn.toannvs.laptopshop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import jakarta.servlet.ServletContext;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class UploadService {

    private final ServletContext servletContext;

    public UploadService(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String handleSaveUploadFile(MultipartFile file, String targetFolder) {
        String finalName = null;
        try {
            if (!file.isEmpty()) {
                // Lấy byte[] từ file
                byte[] bytes = file.getBytes();

                String rootPath = this.servletContext.getRealPath("/resources/images");
                File dir = new File(rootPath + File.separator + targetFolder);

                // Tạo thư mục nếu chưa tồn tại
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // Tạo file lưu trữ với tên duy nhất
                String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
                finalName = fileName;
                File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);

                // Ghi dữ liệu vào file
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalName;
    }

}
