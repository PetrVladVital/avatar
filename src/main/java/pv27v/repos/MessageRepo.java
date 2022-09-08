package pv27v.repos;

import org.springframework.data.repository.CrudRepository;
import pv27v.domain.Message;

import java.util.List;


public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}

