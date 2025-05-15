## 프로젝트 소개

---

<img src="https://github.com/user-attachments/assets/098762e0-b166-4a4a-8e7c-687eda22015a" alt="image" width="300px"/>

FITinside는 LF몰, 무신사와 같은 온라인 쇼핑몰을 모티브로 한 웹사이트입니다.

사용자는 다양한 상품을 탐색하고, 원하는 상품을 장바구니에 담아 관리할 수 있습니다.

회원가입 및 로그인(구글 로그인 포함)을 통해 주문도 완료할 수 있으며 카테고리별 상품 분류 및 쿠폰 적용 기능 등을 추가해 사용자 경험을 향상시켰습니다.

## 팀원 구성

---

간단한 이미지랑 태그걸기

## 개발 기간

---

2024.09.30 ~ 2024.10.25 (1개월)

## 기술 스택 (버전 기입)

---

꼬리질문 3개 이상 (3줄 이상씩은 쓰기, ex. 뭐가 효율적인지?)

다른 기술스택이랑 비교해서 이 기술을 선택한 이유

### Back-end

- Java 17 : 최신 LTS(Long-Term Support) 버전으로 안정성과 성능 제공
- Spring Boot 3.3.4 : 경량화된 자바 프레임워크, RESTful API 구축 및 서버 사이드 로직 처리하는 역할을 수행하고 이번 프로젝트 표준 기술로 채택
- Spring Security 3.3.4 : Spring Boot를 사용하여 개발하는 과정에 높은 연동성을 제공하고 인증, 권한 부여와 엑세스 제어등의 여러 기능을 편리하게 이용하여 사용자 데이터를 안전하게 보호
- JWT 0.12.1: 무상태성(State-Less)를 지향하는 HTTP의 ~~단점을 보완~~ 특성에 적합하고 로그인 정보가 필요한 부분의 확장을 용이하게하는 장점을 이용하고자 선택
- JPA 3.3.4: 개발 과정에서 여러 데이터베이스 사용하고 연동하기 위한 ORM 기술을 사용해 객체지향 언어를 사용한 Spring Boot 프로젝트에 적합  ~~효율적인 데이터베이스 처리 구현~~하고 MyBatis와 같은 SQL Mapping 기술보다 단순한 DB조작을 많이 하는 서비스를 구현하는 이번 프로젝트에 적합
    - ⇒ 내부적으로 최적화하는 부분 많음 / 면접을 위해서 공부하
- MySQL(AWS RDS): 관계형 데이터베이스, 쇼핑몰의 데이터를 저장 및 관리
- Mockito 5.11.0: 단위 테스트를 위한 Mock 라이브러리 ⇒ JUnit
- Jakarta Mail 2.0.3: 이메일 발송을 위한 라이브러리로, Spring Boot와 통합하여 비동기적으로 메일을 전송
- AWS S3 2.2.6:
    - 이미지 파일 관리를 위한 S3 설명 추가

### Front-end

- HTML, CSS : 웹 표준을 준수한 마크업 및 스타일링
- React : 컴포넌트 기반의 UI 라이브러리를 활용하여 효율적인 상태 관리 및 인터랙티브한 사용자 인터페이스 구현
- Axios: 백엔드와의 HTTP 통신을 위한 비동기 요청 처리 라이브러리

### 서비스 배포 환경

- 프론트엔드 배포
    - Netlify
- 백엔드 배포
    - 엘리스 클라우드 VM
        - GNU/Linux 5.15.0-91-generic
        - Ubuntu 22.04.5 LTS

### 버전 및 이슈관리

GitLab Project, GitLab Issues,  GitHub(Netlify 배포용)

### 협업 툴

Discord, Notion

### 기타

- Mapstruct 1.5.3
- Lombok 1.18.34
- Swagger 2.0.4

## 브랜치 전략

---

- Git-flow 전략을 기반으로 master, develop 브랜치와 featue 등의 기능 브랜치를 활용했습니다.
    - master : 배포 단계에서만 사용하는 브랜치입니다.
    - develop : 개발 단계에서의 master 역할을 하는 브랜치입니다.
    - review-develop : 기능 브랜치를 develop에 merge하기 전 코드 리뷰를 통해 정상적으로 동작을 하는지 확인하는 역할을 하는 브랜치입니다.
    - publish-develop : 배포 환경(배포된 서버 URL 반영, RDS 적용 등)을 적용해 놓은 브랜치입니다.
    - feature: 기능 단위로 독립적인 개발 환경을 위해 사용하고 merge 후 브랜치를 삭제해주었습니다.
    - refactor: 기존 코드를 개선하고 구조를 변경하는 브랜치입니다. review-develop으로 merge 후 브랜치를 삭제해 주었습니다.
    - test: 테스트 코드를 작성하거나 기존 테스트 코드를 리팩토링 하는 브랜치입니다. review-develop으로 merge 후 브랜치를 삭제해 주었습니다.

⇒ hotfix , release 브랜치를 안썼으니까 대응이 필요함

## 프로젝트 구조

---

- 도메인별 사용안하는 exception 패키지 삭제하기
    
    ```bash
    
    # address : 배송지
    # banner : 광고
    # cart : 장바구니
    # category : 상품 카테고리
    # coupon : 상품 쿠폰
    # global : 전역 예외
    # member : 회원
    # oath : 인증
    # order : 주문
    # produt : 상품
    
    src
    ├── main
    │   └── java
    │       └── com
    │           └── team2
    │               └── fitinside
    │                   ├── address
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── mapper
    │                   │   ├── repository
    │                   │   └── service
    │                   ├── banner
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── mapper
    │                   │   ├── repository
    │                   │   └── service
    │                   ├── cart
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── mapper
    │                   │   ├── repository
    │                   │   └── service
    │                   ├── category
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── mapper
    │                   │   ├── repository
    │                   │   └── service
    │                   ├── config
    │                   ├── coupon
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── mapper
    │                   │   ├── repository
    │                   │   └── service
    │                   ├── global
    │                   │   └── exception
    │                   ├── jwt
    │                   ├── member
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── mapper
    │                   │   ├── repository
    │                   │   └── service
    │                   ├── oath
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── repository
    │                   │   ├── service
    │                   │   └── util
    │                   ├── order
    │                   │   ├── common
    │                   │   ├── controller
    │                   │   ├── dto
    │                   │   ├── entity
    │                   │   ├── mapper
    │                   │   ├── repository
    │                   │   └── service
    │                   └── product
    │                       ├── controller
    │                       ├── dto
    │                       ├── entity
    │                       ├── image
    │                       ├── mapper
    │                       ├── repository
    │                       └── service
    └── test
        └── java
            └── com
                └── team2
                    └── fitinside
                        ├── auth
                        ├── cart
                        │   ├── controller
                        │   └── service
                        ├── coupon
                        │   ├── controller
                        │   └── service
                        └── member
                            └── service
    
                     
    
    ```
    

## 역할 분담

---

- 회원가입/로그인 → 박진영
- 카테고리/배너 → 유연주
- 상품관리 → 이하현
- 장바구니/쿠폰 → 안창민
- 주문/배송지 → 허수빈

organization 한개 만들어서 모든 팀원이 들어올것 → 각 팀원들의 깃헙 아이디를 태그 (링크 걸어놓음)

## 주요 기능

검색, 정렬, 페이지네이션 기능 추가

---

### 회원

- 이메일, 비밀번호 기반의 로그인 기능
    
    ![FITinside-Chrome-2024-10-24-15-54-44.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/7aced914-ba72-46b9-8c49-b6cd0036a711/FITinside-Chrome-2024-10-24-15-54-44.gif)
    
- 이메일, 비밀번호 기반의 회원가입 기능
    
    ![FITinside-Chrome-2024-10-24-15-20-15.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/7f0806ca-9b78-4f0c-b188-b791a7eb1c93/FITinside-Chrome-2024-10-24-15-20-15.gif)
    
- Google API Cloud 연동한 로그인 기능
    
    ![FITinside-Chrome-2024-10-24-15-54-44.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/ccb51f22-55e3-4c64-b291-45ebcaf3f66a/FITinside-Chrome-2024-10-24-15-54-44.gif)
    
- 클라이언트에 저장된 AccessToken으로 로그인 유지 기능
- 토큰 탈취 대책으로 짧은 수명의 AccessToken, 자동 재발급을 위한 RefreshToken 쿠키 저장

### 배너

![배너1.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/ce6cf0c4-bb7e-4911-8a40-f4e276cbd6f5/%EB%B0%B0%EB%84%881.gif)

- 메인 화면에서 광고 기능
- 배너의 조회, 생성, 수정, 삭제 가능
- 배너를 통한 url 연결 기능

### 카테고리

- 공통(회원, 관리자)
    
    ![카테고리2.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/ba53116d-33d8-4879-95be-62f62a014bba/%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC2.gif)
    
    - 헤더
        
        부모 카테고리의 드롭 다운을 통해 자식 카테고리 조회 가능
        
    - 이미지 포함 카테고리
        
        이미지와 포함 카테고리 조회 가능
        
- 관리자
    
    ![카테고리1.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/4e0f1478-936a-4e65-9ae6-21d087747eb8/%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC1.gif)
    
    - 카테고리 생성, 수정, 삭제 가능(이미지와 정렬 순서 추가 가능)

### 상품

- 공통
    - 상품 조회 & 장바구니로 이동
    
    ![Desktop-2024.10.24-15.33.45.10_상품리스트_-상품_-장바구니_.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/74fe05aa-1bc5-4017-9f1b-de7c5a68b77b/Desktop-2024.10.24-15.33.45.10_%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7%E1%84%85%E1%85%B5%E1%84%89%E1%85%B3%E1%84%90%E1%85%B3_-%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7_-%E1%84%8C%E1%85%A1%E1%86%BC%E1%84%87%E1%85%A1%E1%84%80%E1%85%AE%E1%84%82%E1%85%B5_.gif)
    
- 관리자 페이지
    - 상품 조회 & 상품 등록
        
        ![Desktop-2024.10.24-15.22.02.05-_상품등록_-상품상세페이지_.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/45cb8492-366d-4dda-867c-bb356855ff01/Desktop-2024.10.24-15.22.02.05-_%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7%E1%84%83%E1%85%B3%E1%86%BC%E1%84%85%E1%85%A9%E1%86%A8_-%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A6%E1%84%91%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%8C%E1%85%B5_.gif)
        
    - 상품 관련 데이터를 수정
        
        ![Desktop-2024.10.24-15.28.58.08-_상품수정_.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/2616efe9-77c9-4391-a135-b5d7e4874256/Desktop-2024.10.24-15.28.58.08-_%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7%E1%84%89%E1%85%AE%E1%84%8C%E1%85%A5%E1%86%BC_.gif)
        
    - 상품 삭제
        
        ![Desktop-2024.10.24-15.31.44.09-_상품-삭제_.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/0bc7022e-505e-40ca-af9d-bf9ddd17b616/Desktop-2024.10.24-15.31.44.09-_%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7-%E1%84%89%E1%85%A1%E1%86%A8%E1%84%8C%E1%85%A6_.gif)
        

### 장바구니

![2024-10-24 15-21-01.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/305f273b-3d8d-44b4-bc8c-6a7c33b618aa/2024-10-24_15-21-01.gif)

- 비회원/회원 구분없이 장바구니 추가 가능
- 장바구니 정보가 비회원은 로컬스토리지, 회원은 db에 저장
- 장바구니에 담긴 상품 수량 수정, 삭제 기능
- 배송비, 쿠폰등이 적용된 결제 예정 금액 출력 기능

### 쿠폰

- 관리자
    
    ![2024-10-244.33.01-ezgif.com-video-speed (2).gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/74017197-170e-41b1-86fc-a46132408f36/2024-10-244.33.01-ezgif.com-video-speed_(2).gif)
    
    - 쿠폰 생성, 비활성화 가능
    - 쿠폰 목록 (전체 / 활성화만) 조회 (만료일 기준 오름차순 정렬, 페이지네이션 적용) 가능
    - 쿠폰 보유 (페이지네이션 적용), 미보유 회원 조회 가능
    - 미보유 회원에게 쿠폰 이메일 전송 가능
- 회원
    
    ![화면 기록 2024-10-24 오후 4.57.17.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/87136029-604e-4860-bbb0-5c00a6ffea12/%E1%84%92%E1%85%AA%E1%84%86%E1%85%A7%E1%86%AB_%E1%84%80%E1%85%B5%E1%84%85%E1%85%A9%E1%86%A8_2024-10-24_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.57.17.gif)
    
    - 쿠폰 다운로드 가능
    - 보유한 쿠폰 목록 (전체 / 사용가능) 조회(만료일 기준 오름차순 정렬, 페이지네이션 적용) 가능
    - 쿠폰 사용 내역 (주문서) 조회 가능

### 주문

- 관리자
    
    ![FITinside - Chrome 2024-10-25 03-06-05.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/46cddb2e-a644-46df-8e7d-e54ba9818cf0/FITinside_-_Chrome_2024-10-25_03-06-05.gif)
    
    - 회원의 주문 관리 → 주문 상태 변경, 주문 삭제
    - 주문 상태, 날짜별 검색 기능
- 회원
    
    ![FITinside-Chrome-2024-10-25-10-44-32.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/c08ec402-9ae7-4a19-af44-51f2f2c39241/FITinside-Chrome-2024-10-25-10-44-32.gif)
    
    - 배송지 입력 후 주문 생성 가능
    - 주문 상세 조회
        - 배송 시작 전이면 배송지 수정 / 주문 취소 가능
        - 여기서 수정한 배송지는 주문에만 적용 (배송지 목록에 따로 반영 X)
    - 주문 목록 조회
        - 한 페이지에 총 5개씩 주문 확인 가능 (최신순 정렬)
        - 상품명 검색 기능
    

### 배송지

- 회원
    
    ![FITinside-Chrome-2024-10-25-03-37-53.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/019192c9-29a5-4eda-a880-b9165a6afced/FITinside-Chrome-2024-10-25-03-37-53.gif)
    
    - 배송지는 회원당 최대 5개 저장 가능
        - 5개 제한 → 사용자 편의성 고려
        - 수령인 이름, 우편번호, 주소, 전화번호 중 하나라도 다르면 다른 배송지로 간주
    - 수정, 삭제
    - 기본 배송지 설정 / 해제
        - 기본 배송지 설정 → 주문서 작성 시 자동으로 입력

## 상세 기능

[기능 명세서]([https://www.notion.so/85d4b07fa8d441539a5ea5dc848a463f?pvs=21](https://github.com/A540/Elice_Project2_Fitinside_Back/wiki/FitInside-%EA%B8%B0%EB%8A%A5%EB%AA%85%EC%84%B8%EC%84%9C)) 

## API 명세서

모든 링크는 최대한 해당 레파지토리에서 벗어나지 않는 걸 권장

⇒ 성공 시 ~ / 실패 시 ~ (상태코드)

⇒ request body의 유효성 검증 관련 추가

⇒ s3이미지 → 이미지 관리

⇒ 카테고리 등록 : 단수형 (이슈 등록)

⇒ 카멜케이스 (pathVariable)

⇒ 배송지 생성 단수형

---

### 상세 API 명세서

[API 명세서](https://www.notion.so/API-b31fc4fba5754d38917848d491b0528b?pvs=21) 

## ERD

---

![ft.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d85fd78d-de88-4966-9b27-62e3e2e8c2a0/c2689960-5c8a-4f77-9f56-d283a3d1d3dd/ft.png)

⇒ 카테고리의 displayOrder가 bigint인 이유?

⇒ int, bigint 몇까지?

⇒ erd 그려주는 프로그램 중 한글 주석도 같이 해주는 프로그램 (ex. isDeleted : 삭제여부)

⇒ postalcode, phonenumber varchar255 유효성 검사

### 주요 API 명세서

### 회원 / 인증(`Member / Auth`)

| MVP | Method | URI | Description | Request Body | Request Params | Response |
| --- | --- | --- | --- | --- | --- | --- |
| 사용자 정보 조회 | GET | /api/user/me | 토큰 기반 사용자 정보 조회 | - | - | `{ "username": "string", "email": "string", "phone": "string", "creatAt": "localDateTime"}` |
| 회원가입 | POST | /api/auth | 회원가입 | `{ "userName": "string", "email": "string", "password": "string","phone" : "string" }` | - | `{ "message": "User successfully registered" }` |
| 로그인 | POST | /api/auth/login | 로그인 | `{ "email": "string", "password": "string" }` | - | `200 : { "token": "JWT_ACCESS_TOKEN" }` `401 : { "error": "UNAUTHORIZED" }` |

### 배너(`Banner`)

| **MVP** | **Method** | **URI** | **Description** | **Request body** | **Request Params** | **Response** |
| --- | --- | --- | --- | --- | --- | --- |
| 배너 목록 조회 | GET | /api/banners | 전체 배너 조회 |  |  | `[{ "id": "Long", "title": "string", "imageUrl": "string", "displayOrder": "integer", "targetUrl": "string" }]
200 OK` |

### 카테고리(`Category`)

| **MVP** | **Method** | **URI** | **Description** | **Request body** | **Request Params** | **Response** |
| --- | --- | --- | --- | --- | --- | --- |
| 카테고리 목록 조회 | GET | /api/categories | 전체 카테고리 조회 |  |  | `[{"id": "Long", "name": "string", "displayOrder": "Long", "mainDisplayOrder": "Long", "isDeleted": "Boolean", "parentId": "Long", "imageUrl": "string"}]
200 OK` |

### 상품(`Product`)

| MVP | Method | URI | Description | Request Body | Request Params | Response |
| --- | --- | --- | --- | --- | --- | --- |
| 상품 목록 조회 | GET | /api/products | 전체 상품 목록 조회 (페이지네이션, 정렬, 검색 적용) | - | page (int), size (int), sortField (string), sortDir (string), keyword (string) | - **200 OK** : 상품 목록 조회 성공
{ "id": "Long", "categoryId": "Long", "categoryName": "string", "productName": "string", "price": "int", "createdAt": "datetime", "soldOut": "boolean" }
- **400 Bad Request**: 잘못된 요청  |
| 상품 상세 조회 | GET | /api/products/{id} | 특정 상품 상세 조회 | - | id (Long) | - **200 OK** : 상품 상세 조회 성공 
 { "id": "Long", "categoryId": "Long", "categoryName": "string", "productName": "string", "price": "int", "info": "string", "manufacturer": "string", "productImgUrls": ["url1", "url2"], "createdAt": "datetime", "updatedAt": "datetime", "soldOut": "boolean" } 
- **400 Bad Request**: 잘못된 요청 
- **404 Not Found**: 상품을 찾을 수 없음 |

### 장바구니 (`Cart`)

---

| MVP | Method | URI | Description | Headers | Request Body | Response |
| --- | --- | --- | --- | --- | --- | --- |
| 조회 | GET | /api/carts | 로그인 한 회원의 장바구니 목록 조회 | `Authorization: Bearer JWT_TOKEN` |  | - 200 OK : 
{
    ”message”: “장바구니 조회 완료했습니다!”,
    “carts”: [
        {
            ”productId”: Long,
            “quantity”: int
        }
    ]
}

- 403 Forbidden : “권한이 없는 사용자입니다.”
- 500 Internal Server Error : “서버 에러” |

### 쿠폰(`Coupon`)

---

- 관리자

| MVP | Method | URI | Description | Headers | Request Param | Response |
| --- | --- | --- | --- | --- | --- | --- |
| 쿠폰 목록 조회 | GET | /api/admin/coupons | 존재하는 쿠폰 전체 조회 (유효한 쿠폰만 조회 / 전체 쿠폰 조회) | `Authorization: Bearer JWT_TOKEN` | {
  “page”: int,
  “includeInActiveCoupons”: boolean
} | - 200 OK : 
{
    ”message”: “쿠폰 목록 조회 완료했습니다!”,
    “coupons”: [
        {
            “id”: Long,
             “name”: String,
             “code”: String,
             “type”: CouponType,
             “value”: int,
             “percentage”: int,
             “minValue”: int,
             “active”: boolean,
             “expiredAt”: LocalDate,
             “categoryName”: String,
             “used”: boolean
         }
    ],
    “totalPages”: int
}

- 403 Forbidden : “권한이 없는 사용자입니다.”
- 404 Not Found : “해당하는 정보의 사용자를 찾을 수 없습니다.”
- 500 Internal Server Error : “서버 에러” |
- 회원

| MVP | Method | URI | Description | Headers | RequestParam | Response |
| --- | --- | --- | --- | --- | --- | --- |
| 보유 쿠폰 전체 조회 | GET | /api/coupons | 로그인 한 회원의 보유 쿠폰 전체 조회 (유효한 쿠폰만 조회 / 전체 쿠폰 조회) | `Authorization: Bearer JWT_TOKEN` | {
    “page”: int,
    “includeInActiveCoupons”: boolean
} | - 200 OK : 
{
”message”: “쿠폰 목록 조회 완료했습니다!”
    “coupons”: [
        {
            “id”: Long,
            “name”: String,
            “code”: String,
            “type”: CouponType,
            “value”: int,
            “percentage”: int,
            “minValue”: int,
            “active”: boolean,
            “expiredAt”: LocalDate,
            “categoryName”: String,
            “used”: boolean
         }
    ],
    “totalPages”: int
}

- 403 Forbidden : “권한이 없는 사용자입니다.”
- 500 Internal Server Error : “서버 에러” |
| 쿠폰 사용 | POST | /api/coupons/{couponMemberId} | 상품에 쿠폰 사용 | `Authorization: Bearer JWT_TOKEN` |  | - 200 OK : “쿠폰이 사용되었습니다! couponMemberId: ” + couponMemberId

- 400 Bad Request : “쿠폰 정보가 유효하지 않습니다.”
- 403 Forbidden : “권한이 없는 사용자입니다.”
- 500 Internal Server Error : “서버 에러” |

### 주문(`Order`)

| MVP | Method | URI | Description | RequestBody | Request Params | Response |
| --- | --- | --- | --- | --- | --- | --- |
| 전체 주문 조회 (관리자) | GET | /api/admin/orders | 모든 회원의 전체 주문 조회 |  | `{
"page":"int",
"orderStatus":"string",
"startDate":"localDateTime",
"endDate":"localDateTime"
}` | - 200 OK :
`[{
"orders":[
  {"orderId":"int",
  "orderStatus":"string",
  "totalPrice":"int",
  "discountedTotalPrice":"int",
  "email":"string",
  "createdAt":"localDateTime",
  "coupons":[
    {"couponId":"int",
    "name":"string",
    "discountPrice":"int"}
  ]}
],
"totalPages":"int"
}]`

- 403 Forbidden : “권한이 없습니다.”
- 500 Internal Server Error : “서버 에러” |
| 전체 주문 조회 (회원) | GET | /api/orders | 각 회원의 전체 주문 조회 |  | `{
"page":"int",
"productName":"string"
}` | - 200 OK :
`[{
"orders":[
  "orderId":"int",
  "orderStatus":"string",
  "totalPrice":"int",
  "discountedTotalPrice":"int",
  "deliveryAddress":"string",
  "productNames":[
    "string"
  ],{}
  "productImgUrl":"string",
  "createdAt":"localDateTime"
],
"totalPages":"int"
}]`

- 403 Forbidden : “권한이 없습니다.”
- 500 Internal Server Error : “서버 에러” |
| 주문 생성 (회원) | POST | /api/order | 주문 생성 | `{
"postalCode":"string",
"deliveryAddress":"string",
"detailedAddress":"string",
"deliveryReceiver":"string",
"deliveryPhone":"string",
"deliveryMemo":"string",
"deliveryFee":"int",
"orderItems":[
  "productId":"int",
  "productName":"string",
  "quantity":"int",
  "itemPrice":"int",
  "originalTotalPrice":"int",
  "discountedTotalPrice":"int",
  "couponName":"string",
  "couponMemberId":"int"
]
}` |  | - 201 Created :
`{
"orderId":"int",
"orderStatus":"string",
"totalPrice":"int",
"discountedTotalPrice":"int",
"deliveryFee":"int",
"postalCode":"string",
"deliveryAddress":"string",
"detailedAddress":"string",
"deliveryReceiver":"string",
"deliveryPhone":"string",
"deliveryMemo":"string",
"createdAt":"localDateTime",
"orderProducts":[
  "productId":"int",
  "orderProductName":"string",
  "orderProductPrice":"int",
  "count":"int",
  "discountedPrice":"int",
  "couponName":"string",
  "productImgUrl":"stirng"
]
}`

- 400 Bad Request : “품절된 상품”
- 403 Forbidden : “권한이 없습니다.”
- 404 Not Found : “비어있는 장바구니”
- 500 Internal Server Error : “서버 에러” |

### 배송지(`Address`)

| MVP | Method | URI | Description | Request Body | Request Params | Response |
| --- | --- | --- | --- | --- | --- | --- |
| 전체 배송지 조회 | GET | /api/addresses | 각 회원의 전체 배송지 조회 |  |  | - 200 OK :
`[{
"addressId":"int",
"deliveryReceiver":"string",
"deliveryPhone":"int",
"postalCode":"string",
"deliveryAddress":"string",
"detailedAddress":"string",
"deliveryMemo":"string",
"defaultAddress":"string"
}]`

- 403 Forbidden : “권한이 없습니다.”
- 500 Internal Server Error : “서버 에러” |

## Exception Handling & HTTP Status Code

---

```markdown
## Exception Handling and HTTP Status Codes

### 1. **400 Bad Request**
클라이언트의 잘못된 요청으로 인해 발생하는 오류입니다.
- **POST_DELETED**: 삭제된 게시글입니다.
- **REVIEW_DELETED**: 삭제된 리뷰입니다.
- **COMMENT_DELETED**: 삭제된 댓글입니다.
- **EMPTY_FILE_EXCEPTION**: 빈 파일입니다.
- **NO_FILE_EXTENSION**: 파일 확장자가 없습니다.
- **INVALID_FILE_EXTENSION**: 허용되지 않는 파일 확장자입니다.
- **INVALID_FILE_FORMAT**: 허용되지 않는 파일 형식입니다.
- **AUTH_CODE_EXTENSION**: 로그인을 실패하였습니다(임시).
- **INVALID_PRODUCT_DATA**: 상품 정보가 유효하지 않습니다.
- **INVALID_PRODUCT_PRICE**: 가격은 0 이상이어야 합니다.
- **INVALID_PRODUCT_NAME_LENGTH**: 상품명은 100자 이하로 입력해야 합니다.
- **INVALID_PRODUCT_INFO_LENGTH**: 상품 설명은 500자 이하로 입력해야 합니다.
- **INVALID_MANUFACTURER_LENGTH**: 제조사는 100자 이하로 입력해야 합니다.
- **INVALID_COUPON_DATA**: 쿠폰 정보가 유효하지 않습니다.
- **INVALID_COUPON_CREATE_DATA**: 쿠폰 생성 정보가 유효하지 않습니다.
- **INVALID_EMAIL_DATA**: 이메일 정보가 유효하지 않습니다.
- **OUT_OF_STOCK**: 현재 주문 가능한 상품의 개수를 초과했습니다.
- **ORDER_MODIFICATION_NOT_ALLOWED**: 배송이 시작된 주문은 수정할 수 없습니다.
- **CART_OUT_OF_RANGE**: 상품 수량은 1개 이상 20개 이하여야 합니다.
- **INVALID_CATEGORY_DATA**: 카테고리 정보가 유효하지 않습니다.

### 2. **401 Unauthorized**
인증되지 않은 사용자가 접근을 시도할 때 발생하는 오류입니다.
- **INVALID_AUTH_TOKEN**: 권한 정보가 없는 토큰입니다.
- **USER_NOT_AUTHENTICATED**: 인증되지 않은 사용자입니다.

### 3. **403 Forbidden**
사용자가 권한이 없는 리소스에 접근하려 할 때 발생하는 오류입니다.
- **USER_NOT_AUTHORIZED**: 권한이 없는 사용자입니다.

### 4. **404 Not Found**
요청한 리소스가 존재하지 않을 때 발생하는 오류입니다.
- **USER_NOT_FOUND**: 해당하는 정보의 사용자를 찾을 수 없습니다.
- **OBJECT_NOT_FOUND**: 대상을 찾을 수 없습니다.
- **RESOURCE_NOT_FOUND**: 대상을 찾을 수 없습니다.
- **PRODUCT_NOT_FOUND**: 해당 상품을 찾을 수 없습니다.
- **CATEGORY_NOT_FOUND**: 해당 카테고리를 찾을 수 없습니다.
- **CART_NOT_FOUND**: 해당 장바구니를 찾을 수 없습니다.
- **COUPON_NOT_FOUND**: 해당 쿠폰을 찾을 수 없습니다.
- **ORDER_NOT_FOUND**: 주문을 찾을 수 없습니다.
- **CART_EMPTY**: 장바구니가 비어있습니다.
- **ORDER_PRODUCT_NOT_FOUND**: 해당 상품에 대한 주문을 찾을 수 없습니다.
- **ADDRESS_NOT_FOUND**: 해당 배송지를 찾을 수 없습니다.

### 5. **409 Conflict**
리소스의 현재 상태와 충돌할 때 발생하는 오류입니다.
- **DUPLICATE_RESOURCE**: 데이터가 이미 존재합니다.
- **DUPLICATE_COUPON**: 쿠폰 등록 이력이 존재합니다.
- **EXCEEDED_MAX_ADDRESS_LIMIT**: 배송지 최대 저장 개수를 초과했습니다.
- **DUPLICATE_ADDRESS**: 배송지가 이미 존재합니다.

### 6. **410 Gone**
리소스가 더 이상 유효하지 않을 때 발생하는 오류입니다.
- **USER_ALREADY_DELETED**: 탈퇴된 사용자입니다.
- **PLACE_DELETED**: 삭제된 장소입니다.
- **CATEGORY_ALREADY_DELETED**: 이미 삭제된 카테고리입니다.

### 7. **500 Internal Server Error**
서버 내부에서 예상치 못한 오류가 발생했을 때 반환하는 상태 코드입니다.
- **IO_EXCEPTION_ON_IMAGE_UPLOAD**: 이미지 업로드 중 입출력 오류가 발생했습니다.
- **PUT_OBJECT_EXCEPTION**: S3에 객체를 업로드하는 중 예외가 발생했습니다.
- **IO_EXCEPTION_ON_IMAGE_DELETE**: 이미지 삭제 중 입출력 오류가 발생했습니다.
- **PRODUCT_LIST_RETRIEVAL_ERROR**: 상품 목록 조회 중 서버 에러 발생.
- **PRODUCT_DETAIL_RETRIEVAL_ERROR**: 상품 상세 조회 중 서버 에러 발생.
- **PRODUCT_CREATION_ERROR**: 상품 등록 중 서버 에러 발생.
- **PRODUCT_UPDATE_ERROR**: 상품 수정 중 서버 에러 발생.
- **PRODUCT_DELETION_ERROR**: 상품 삭제 중 서버 에러 발생.

```

## 트러블슈팅

---

- Oauth 로그인 시 회원 id가 Long 타입이 아닌 String타입으로 담기는 문제가 발생하여 SecurityContextHolder 디버깅을 통해 데이터 확인 후 로그인 방식에 따라 회원 id를 다르게 가져오도록 처리
    - [**Security 로그인 유저, Oauth2 로그인 유저로 만들어지는 SecurityContextHolder. authentication.getName()의 차이**](https://www.notion.so/Security-Oauth2-SecurityContextHolder-authentication-getName-9dee3bece0ed4ee5ac4e8b0054f3dd78?pvs=21)
- 쿠폰 도메인에서 여러 메서드에서 n+1 문제가 발생하여 레파지토리에 fetch join을 포함한 jpql을 적용하여 해결
    - [트러블 슈팅 - 쿠폰 도메인에서 발생한 N+1 문제 ](https://www.notion.so/N-1-daca82b0021b4a73959d97a8aec70d1e?pvs=21)
- 기술 표준 RFC에 따라 AccessToken을 json body로 전달, js조작의 편리함을 위해 RefreshToken만 쿠키에 저장하도록 결정
    - [**JWT를 사용한 accessToken과 refreshToken 전달, 저장 방식 고찰**](https://www.notion.so/JWT-accessToken-refreshToken-3215693229954f3295a2327a4a97c41e?pvs=21)

- 단위 테스트 코드 작성 시 JpaAuditingHandler 빈 생성 오류가 발생하여 JpaAuditingConfig 클래스를 생성하여 해결
    - [트러블 슈팅 - 테스트 코드 작성 시JpaAuditingHandler 빈 생성 오류](https://www.notion.so/JpaAuditingHandler-a44647b8c17f4f20849d5594a1e13fc8?pvs=21)

- 토큰 인증 예외가 아닌 경우에도 401 에러가 반환되는 문제가 발생하여 CustomExceptionHandler에 유효성 검사 예외 처리 메서드를 추가하여 해결
    - [트러블 슈팅 - 토큰 인증 예외가 아닌 경우에도 401 에러가 반환되는 문제](https://www.notion.so/401-2e1a9d9321fe44d7a56975db16e01035?pvs=21)
