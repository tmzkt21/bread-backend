package com.bread.web.file;

import com.bread.web.user.User;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface FileService extends GenericService<File> {

}
@Service
@AllArgsConstructor
public class FileServiceImpl implements FileService{
private final FileRepository fileRepository;
    @Override
    public void save(File file) {
        fileRepository.save(file);
    }

    @Override
    public Optional<File> findById(Long id) {
        return fileRepository.findById(id);
    }

    @Override
    public Iterable<File> findAll() {
        return fileRepository.findAll();
    }

    @Override
    public boolean exists(String id) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(String id) {

    }
}
