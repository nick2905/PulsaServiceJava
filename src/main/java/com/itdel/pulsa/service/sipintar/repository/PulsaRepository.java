package com.itdel.pulsa.service.sipintar.repository;

import com.itdel.pulsa.service.sipintar.model.PulsaModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PulsaRepository extends MongoRepository<PulsaModel, String> {
}
