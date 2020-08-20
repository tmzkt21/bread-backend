package com.bread.web.user;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

interface UserService extends GenericService<User> {

    Optional<User> findByUserId(String userId);
    void allUpdate(List<User> user);
    void readCsv();

}

@Service @AllArgsConstructor
public class UserServiceImpl implements UserService {
    final private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean exists(String id) {
        return false;
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public void allUpdate(List<User> user) {
        userRepository.saveAll(user);
    }

    @Override
    public void readCsv() {
        InputStream is = getClass().getResourceAsStream("/static/user.csv");

        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT);
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords) {
                userRepository.save(new User(
                        csvRecord.get(1),
                        csvRecord.get(2),
                        csvRecord.get(3),
                        csvRecord.get(4),
                        csvRecord.get(5),
                        csvRecord.get(6),
                        csvRecord.get(7)
                        ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}