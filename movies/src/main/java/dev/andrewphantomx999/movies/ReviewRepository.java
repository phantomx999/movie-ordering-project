package dev.andrewphantomx999.movies;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;


@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
