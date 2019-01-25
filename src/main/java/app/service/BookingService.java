package app.service;

import app.model.BookingModel;
import java.util.List;
import java.util.Optional;

public interface BookingService {
    BookingModel save(BookingModel bookingModel);
    List<BookingModel> getAllBookings();
    Optional<Iterable<BookingModel>> findByStatus(String status);
    Optional<BookingModel> findById(String id);
}
