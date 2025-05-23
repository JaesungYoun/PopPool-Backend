package com.application.poppool.domain.popup.dto.resonse;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
public class GetOpenPopUpStoreListResponse {

    private List<PopUpStore> openPopUpStoreList;
    private boolean loginYn;
    private int totalPages;
    private long totalElements;


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PopUpStore {
        private Long id;
        private String categoryName;
        private String name;
        private String address;
        private String mainImageUrl;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private boolean bookmarkYn;
    }

}
