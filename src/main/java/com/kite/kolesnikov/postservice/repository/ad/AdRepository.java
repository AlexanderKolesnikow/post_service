package com.kite.kolesnikov.postservice.repository.ad;

import com.kite.kolesnikov.postservice.entity.ad.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {

    @Query("SELECT a FROM Ad a WHERE a.post.id = ?1")
    Optional<Ad> findByPostId(long postId);

    List<Ad> findAllByBuyerId(long buyerId);
}
