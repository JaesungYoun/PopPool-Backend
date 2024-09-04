## 팝풀(PopPool)
**흩어져 있는 팝업스토어 정보를 제공하고 인스타그램 연동으로 부가 기능을 제공하는 서비스**

<p align="left">
  <img src="https://avatars.githubusercontent.com/u/171132535?s=200&v=4"/>
</p>

## 목차
1. 프로젝트 멤버 소개
2. 서비스 소개
3. 기술 스택
4. 시스템 아키텍처
5. 주요 기능
6. 협업 관리
7. 프로젝트 기간
8. 프로젝트 관련 문서
</br>

## 👪 프로젝트 멤버 소개
<p align="center">
  <table>
      <tr>
        <td>
          <img src="https://avatars.githubusercontent.com/u/134565003?v=4" width="120px" height="120px" />
        </td>
        <td>
          <img src="https://avatars.githubusercontent.com/u/171133308?v=4" width="120px" height="120px" />
        </td>
        <td>
          <img src="https://avatars.githubusercontent.com/u/119504454?v=4" width="120px" height="120px" />
        </td>
        <td>
          <img src="https://avatars.githubusercontent.com/u/112812473?v=4" width="120px" height="120px" />
        </td>
        <td>
          <img src="https://avatars.githubusercontent.com/u/122965360?v=4" width="120px" height="120px" />
        </td>
        <td>
          <img src="https://avatars.githubusercontent.com/u/73388615?v=4" width="120px" height="120px" />
        </td>
      </tr>
      <tr>
          <td height="30px" width="120px" align="center"> <a href="https://github.com/chae-rok">
           🙂 김채연 <br>(기획) </a> <br></td>
          <td height="30px" width="120px" align="center"> <a href="https://github.com/jaeeun0416">
           🙂 이재은 <br>(디자이너) </a> <br></td>
          <td height="30px" width="120px" align="center"> <a href="https://github.com/Madman-dev">
           🙂 이동준 <br>(iOS) </a> <br></td>
          <td height="30px" width="120px" align="center"> <a href="https://github.com/dongglehada">
           🙂 서준영 <br>(iOS) </a> <br></td>
          <td height="30px" width="120px" align="center"> <a href="https://github.com/zzangzzangguy">
           🙂 김기현 <br>(iOS) </a> <br></td>
          <td height="30px" width="120px" align="center"> <a href="https://github.com/JaesungYoun">
           🙂 윤재성 <br>(backend) </a> <br></td>
      </tr>
  </table>
</p>

## 💡 서비스 소개
**흩어져 있는 팝업스토어 정보를 제공하고 인스타그램 연동으로 부가 기능을 제공하는 앱 서비스**
>PopPool은 PopUpStore + Pool 의 약자로, 팝업의 장이라는 의미의 이름입니다.</br>
>PopPool은 다양한 팝업스토어들에 대해 소개하고 인스타그램 연동으로 교류할 수 있는 서비스를 제공합니다.

</br>

## 🛠️ 기술 스택

### iOS
![Swift](https://img.shields.io/badge/Swift-FA7343?style=flat&logo=swift&logoColor=white)
![UIkit](https://img.shields.io/badge/UIKit-007AFF?style=flat&logo=apple&logoColor=white)
![RxSwift](https://img.shields.io/badge/RxSwift-8A2C5A?style=flat&logo=react&logoColor=white)
![Clean Architecture](https://img.shields.io/badge/Clean%20Architecture-4CAF50?style=flat&logo=architecture&logoColor=white)
![MVVM](https://img.shields.io/badge/MVVM-FF5722?style=flat&logo=architecture&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)
</br>

### BackEnd
![Java](https://img.shields.io/badge/java-007396.svg?style=flat&logo=openjdk&logoColor=white)
![SpringBoot](https://img.shields.io/badge/springboot-%236DB33F.svg?style=flat&logo=springboot&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-%236DB33F.svg?style=flat&logo=JPA&logoColor=white)
![QueryDsl](https://img.shields.io/badge/QueryDsl-2185D0?style=flat&logo=QueryDsl&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=flat&logo=swagger&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=flat&logo=JSON%20web%20tokens)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=flat&logo=mysql&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-232F3E?style=flate&logo=amazon-aws&logoColor=white)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=flat&logo=jenkins&logoColor=white)
</br>

### 상세 기술스택 및 버전
| 구분     | 기술스택             | 상세내용                | 버전     |
|----------|---------------------|-------------------------|----------|
| 공통     | 형상관리             | Git                     | 2.44.0   |
|          | 커뮤니케이션         | Notion, Discord | -        |
| iOS | Framework       | -  UIkit                       | -        |
|     | Architecture    | -  Clean Architecture          | -        |
|     | Design Pattern  | -  MVVM + Input/Output Pattern | -        |
|     | Asnyc/Await     | -  RxSwift                     | -        |
|     | Network         | -  Alamofire / Network Layer   | -        |
|     | Asnyc/Await     | -  RxSwift                     | -        |
| BackEnd  | DB                  | MySQL                   | 8.0.32      |
|          |                     | JPA                     | \-          |
|          |                     | QueryDSL                | 5.0.0       |
|          | Java                | JDK                     | 17.0.12      |
|          | Spring              | Spring Boot             | 3.2.6       |
|          |                     | Spring Security         | 6.2.4       |
|          | JWT                 | jjwt                    | 0.11.5      |
|          | IDE                 | Intellij(Community)     | 23.3.5      |
|          | Build               | Gradle                  | 8.7         |
|          | API Docs            | OpenAPI(Swagger)        | 3.0.1       |
| Infra   | Server              | AWS EC2                 | -           |
|         | DB              | AWS RDS                 | -           |
|         | Object Storage              | AWS S3                 | -           |
| Server   | Deploy              | Jenkins                  | -           |
</br>

## 🗂️ 시스템 아키텍처
</br>


## 📁 Back-End 소스 코드 폴더 구조

```bash
src
├─ main
│  ├─ java
│  │  └─ com
│  │     └─ application
│  │        └─ poppool
│  │           ├─ domain
│  │           │  ├─ admin
│  │           │  │  ├─ notice
│  │           │  │  │  ├─ controller
│  │           │  │  │  │  ├─ AdminNoticeController.java
│  │           │  │  │  │  └─ AdminNoticeControllerDoc.java
│  │           │  │  │  ├─ dto
│  │           │  │  │  │  └─ request
│  │           │  │  │  │     ├─ CreateNoticeRequest.java
│  │           │  │  │  │     └─ UpdateNoticeRequest.java
│  │           │  │  │  └─ service
│  │           │  │  │     └─ AdminNoticeService.java
│  │           │  │  └─ popup
│  │           │  │     ├─ controller
│  │           │  │     │  ├─ AdminPopUpStoreController.java
│  │           │  │     │  └─ AdminPopUpStoreControllerDoc.java
│  │           │  │     ├─ dto
│  │           │  │     │  ├─ request
│  │           │  │     │  │  ├─ CreatePopUpStoreRequest.java
│  │           │  │     │  │  └─ UpdatePopUpStoreRequest.java
│  │           │  │     │  └─ response
│  │           │  │     │     ├─ GetAdminPopUpStoreDetailResponse.java
│  │           │  │     │     └─ GetAdminPopUpStoreListResponse.java
│  │           │  │     └─ service
│  │           │  │        └─ AdminPopUpStoreService.java
│  │           │  ├─ auth
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ AuthController.java
│  │           │  │  │  └─ AuthControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  ├─ info
│  │           │  │  │  │  ├─ ApplePublicKeys.java
│  │           │  │  │  │  └─ KakaoToken.java
│  │           │  │  │  ├─ request
│  │           │  │  │  │  ├─ AppleLoginRequest.java
│  │           │  │  │  │  └─ KakaoLoginRequest.java
│  │           │  │  │  └─ response
│  │           │  │  │     └─ LoginResponse.java
│  │           │  │  ├─ enums
│  │           │  │  │  ├─ SocialType.java
│  │           │  │  │  └─ TokenType.java
│  │           │  │  ├─ repository
│  │           │  │  │  └─ RefreshTokenRepository.java
│  │           │  │  └─ service
│  │           │  │     ├─ apple
│  │           │  │     │  ├─ AppleAuthFeignClient.java
│  │           │  │     │  └─ AppleAuthService.java
│  │           │  │     └─ kakao
│  │           │  │        ├─ KakaoAuthFeignClient.java
│  │           │  │        └─ KakaoAuthService.java
│  │           │  ├─ aws
│  │           │  │  └─ health
│  │           │  │     └─ HealthCheckController.java
│  │           │  ├─ bookmark
│  │           │  │  ├─ entity
│  │           │  │  └─ repository
│  │           │  ├─ category
│  │           │  │  ├─ entity
│  │           │  │  │  └─ CategoryEntity.java
│  │           │  │  ├─ enums
│  │           │  │  │  └─ Category.java
│  │           │  │  ├─ repository
│  │           │  │  │  └─ CategoryRepository.java
│  │           │  │  └─ service
│  │           │  │     └─ CategoryService.java
│  │           │  ├─ comment
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ CommentController.java
│  │           │  │  │  └─ CommentControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  └─ request
│  │           │  │  │     ├─ CreateCommentRequest.java
│  │           │  │  │     └─ UpdateCommentRequest.java
│  │           │  │  ├─ entity
│  │           │  │  │  └─ CommentEntity.java
│  │           │  │  ├─ enums
│  │           │  │  │  └─ CommentType.java
│  │           │  │  ├─ repository
│  │           │  │  │  ├─ CommentRepository.java
│  │           │  │  │  ├─ CommentRepositoryCustom.java
│  │           │  │  │  └─ CommentRepositoryImpl.java
│  │           │  │  └─ service
│  │           │  │     └─ CommentService.java
│  │           │  ├─ file
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ FileController.java
│  │           │  │  │  └─ FileControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  ├─ request
│  │           │  │  │  │  └─ PreSignedUrlRequest.java
│  │           │  │  │  └─ response
│  │           │  │  │     └─ PreSignedUrlResponse.java
│  │           │  │  └─ service
│  │           │  │     └─ FileService.java
│  │           │  ├─ home
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ HomeController.java
│  │           │  │  │  └─ HomeControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  ├─ request
│  │           │  │  │  └─ response
│  │           │  │  │     └─ GetHomeInfoResponse.java
│  │           │  │  └─ service
│  │           │  │     └─ HomeService.java
│  │           │  ├─ image
│  │           │  │  ├─ entity
│  │           │  │  │  ├─ CommentImageEntity.java
│  │           │  │  │  └─ PopUpStoreImageEntity.java
│  │           │  │  └─ repository
│  │           │  │     ├─ CommentImageRepository.java
│  │           │  │     └─ PopUpStoreImageRepository.java
│  │           │  ├─ interest
│  │           │  │  └─ dto
│  │           │  │     ├─ request
│  │           │  │     └─ response
│  │           │  ├─ like
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ LikeController.java
│  │           │  │  │  └─ LikeControllerDoc.java
│  │           │  │  ├─ entity
│  │           │  │  │  └─ LikeEntity.java
│  │           │  │  ├─ repository
│  │           │  │  │  └─ LikeRepository.java
│  │           │  │  └─ service
│  │           │  │     └─ LikeService.java
│  │           │  ├─ location
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ LocationController.java
│  │           │  │  │  └─ LocationControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  ├─ request
│  │           │  │  │  └─ response
│  │           │  │  │     ├─ GetViewBoundPopUpStoreListResponse.java
│  │           │  │  │     └─ SearchPopUpStoreByMapResponse.java
│  │           │  │  ├─ entity
│  │           │  │  │  └─ LocationEntity.java
│  │           │  │  ├─ repository
│  │           │  │  │  └─ LocationRepository.java
│  │           │  │  └─ service
│  │           │  │     └─ LocationService.java
│  │           │  ├─ notice
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ NoticeController.java
│  │           │  │  │  └─ NoticeControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  └─ response
│  │           │  │  │     ├─ GetNoticeDetailResponse.java
│  │           │  │  │     └─ GetNoticeListResponse.java
│  │           │  │  ├─ entity
│  │           │  │  │  └─ NoticeEntity.java
│  │           │  │  ├─ repository
│  │           │  │  │  └─ NoticeRepository.java
│  │           │  │  └─ service
│  │           │  │     └─ NoticeService.java
│  │           │  ├─ popup
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ PopUpStoreController.java
│  │           │  │  │  └─ PopUpStoreControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  └─ resonse
│  │           │  │  │     ├─ GetClosedPopUpStoreListResponse.java
│  │           │  │  │     ├─ GetOpenPopUpStoreListResponse.java
│  │           │  │  │     ├─ GetPopUpStoreDetailResponse.java
│  │           │  │  │     └─ GetPopUpStoreDirectionResponse.java
│  │           │  │  ├─ entity
│  │           │  │  │  └─ PopUpStoreEntity.java
│  │           │  │  ├─ repository
│  │           │  │  │  ├─ PopUpStoreRepository.java
│  │           │  │  │  ├─ PopUpStoreRepositoryCustom.java
│  │           │  │  │  └─ PopUpStoreRepositoryImpl.java
│  │           │  │  └─ service
│  │           │  │     └─ PopUpStoreService.java
│  │           │  ├─ search
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ SearchController.java
│  │           │  │  │  └─ SearchControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  └─ SearchPopUpStoreResponse.java
│  │           │  │  └─ service
│  │           │  │     └─ SearchService.java
│  │           │  ├─ sign_up
│  │           │  │  ├─ controller
│  │           │  │  │  ├─ SignUpController.java
│  │           │  │  │  └─ SignUpControllerDoc.java
│  │           │  │  ├─ dto
│  │           │  │  │  ├─ request
│  │           │  │  │  │  └─ SignUpRequest.java
│  │           │  │  │  └─ response
│  │           │  │  │     ├─ GetCategoryListResponse.java
│  │           │  │  │     └─ GetGenderResponse.java
│  │           │  │  └─ service
│  │           │  │     └─ SignUpService.java
│  │           │  ├─ token
│  │           │  │  ├─ entity
│  │           │  │  │  ├─ BlackListTokenEntity.java
│  │           │  │  │  └─ RefreshTokenEntity.java
│  │           │  │  ├─ repository
│  │           │  │  │  ├─ BlackListTokenRepository.java
│  │           │  │  │  └─ RefreshTokenRepository.java
│  │           │  │  └─ service
│  │           │  │     ├─ BlackListTokenService.java
│  │           │  │     └─ RefreshTokenService.java
│  │           │  └─ user
│  │           │     ├─ controller
│  │           │     │  ├─ UserController.java
│  │           │     │  ├─ UserControllerDoc.java
│  │           │     │  ├─ UserProfileController.java
│  │           │     │  └─ UserProfileControllerDoc.java
│  │           │     ├─ dto
│  │           │     │  ├─ request
│  │           │     │  │  ├─ CheckedSurveyListRequest.java
│  │           │     │  │  ├─ UpdateMyInterestCategoryRequest.java
│  │           │     │  │  ├─ UpdateMyProfileRequest.java
│  │           │     │  │  └─ UpdateMyTailoredInfoRequest.java
│  │           │     │  └─ response
│  │           │     │     ├─ GetBlockedUserListResponse.java
│  │           │     │     ├─ GetBookMarkPopUpStoreListResponse.java
│  │           │     │     ├─ GetMyCommentedPopUpStoreListResponse.java
│  │           │     │     ├─ GetMyCommentResponse.java
│  │           │     │     ├─ GetMyPageResponse.java
│  │           │     │     ├─ GetMyRecentViewPopUpStoreListResponse.java
│  │           │     │     ├─ GetProfileResponse.java
│  │           │     │     └─ GetWithDrawlSurveyResponse.java
│  │           │     ├─ entity
│  │           │     │  ├─ BlockedUserEntity.java
│  │           │     │  ├─ BookMarkPopUpStoreEntity.java
│  │           │     │  ├─ RoleEntity.java
│  │           │     │  ├─ UserEntity.java
│  │           │     │  ├─ UserInterestCategoryEntity.java
│  │           │     │  ├─ UserPopUpStoreViewEntity.java
│  │           │     │  ├─ UserRoleEntity.java
│  │           │     │  └─ WithDrawalSurveyEntity.java
│  │           │     ├─ enums
│  │           │     │  ├─ Gender.java
│  │           │     │  ├─ Role.java
│  │           │     │  └─ WithDrawlSurvey.java
│  │           │     ├─ repository
│  │           │     │  ├─ BlockedUserRepository.java
│  │           │     │  ├─ BlockedUserRepositoryCustom.java
│  │           │     │  ├─ BlockedUserRepositoryImpl.java
│  │           │     │  ├─ BookMarkPopUpStoreRepository.java
│  │           │     │  ├─ RoleRepository.java
│  │           │     │  ├─ UserInterestCategoryRepository.java
│  │           │     │  ├─ UserPopUpStoreViewRepository.java
│  │           │     │  ├─ UserRepository.java
│  │           │     │  └─ WithDrawlRepository.java
│  │           │     └─ service
│  │           │        ├─ UserProfileService.java
│  │           │        └─ UserService.java
│  │           ├─ global
│  │           │  ├─ audit
│  │           │  │  ├─ AdminEntityListener.java
│  │           │  │  ├─ BaseAdminEntity.java
│  │           │  │  ├─ BaseEntity.java
│  │           │  │  ├─ BaseTimeAdminEntity.java
│  │           │  │  ├─ BaseTimeEntity.java
│  │           │  │  └─ JpaAuditConfig.java
│  │           │  ├─ config
│  │           │  │  ├─ QuerydslConfig.java
│  │           │  │  ├─ S3Config.java
│  │           │  │  └─ SwaggerConfig.java
│  │           │  ├─ converter
│  │           │  │  ├─ BooleanToYNConverter.java
│  │           │  │  ├─ CategoryConverter.java
│  │           │  │  ├─ CommentTypeConverter.java
│  │           │  │  ├─ EnumToStringConverter.java
│  │           │  │  ├─ GenderConverter.java
│  │           │  │  ├─ StringToCategoryConverter.java
│  │           │  │  └─ WithDrawlSurveyConverter.java
│  │           │  ├─ enums
│  │           │  │  └─ BaseEnum.java
│  │           │  ├─ exception
│  │           │  │  ├─ ApiControllerExceptionAdvice.java
│  │           │  │  ├─ BadRequestException.java
│  │           │  │  ├─ BaseException.java
│  │           │  │  ├─ ConcurrencyException.java
│  │           │  │  ├─ ErrorCode.java
│  │           │  │  ├─ ExceptionResponse.java
│  │           │  │  ├─ NotFoundException.java
│  │           │  │  └─ UnAuthorizedException.java
│  │           │  ├─ jwt
│  │           │  │  ├─ JwtAuthenticationFilter.java
│  │           │  │  ├─ JwtProperties.java
│  │           │  │  └─ JwtService.java
│  │           │  ├─ security
│  │           │  │  ├─ CustomAccessDeniedHandler.java
│  │           │  │  ├─ CustomAuthenticationEntryPoint.java
│  │           │  │  ├─ CustomUserDetailsService.java
│  │           │  │  └─ SecurityConfig.java
│  │           │  └─ utils
│  │           │     ├─ AgeGroupUtils.java
│  │           │     ├─ QueryDslUtils.java
│  │           │     ├─ SecurityUtils.java
│  │           │     └─ TimeUtils.java
│  │           └─ PopPoolApplication.java
│  └─ resources
│     ├─ application-dev.yml
│     ├─ application-local.yml
│     ├─ application.yml
│     ├─ data.sql
│     ├─ static
│     └─ templates
└─ test
   ├─ java
   │  └─ com
   │     └─ application
   │        └─ poppool
   │           └─ PopPoolApplicationTests.java
   └─ resources
      └─ application-test.yml

```

## 👥 협업 관리
- [Notion](https://www.notion.so/POP-POOL-11f3e1b836684b86b4b78dae7d179a23)
</br>

## 📆 프로젝트 기간
### 24.05.15 ~ 24.08.31
</br>

## 📋 프로젝트 관련 문서
- [ERD](https://www.erdcloud.com/d/wkrkmAGhaCbwBpN7X)
</br>
