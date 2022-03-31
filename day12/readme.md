# 3/31 day12

문자열 스트림(FileWriter, FileReader)
* 문자열 스트림은 2byte 체계
* utf8은 3byte 체계
* 자바는 유니코드 2byte 체계
* ms949 2byte 체계
* 문자열 스트림은 내용에 신경쓸 것
* 바이트 스트림은 메모리에 신경쓸 것
* 문자열 입력시 3byte -> 2byte -> 3byte
* 유니코드는 인코딩을 해야하는데 기본적으로 하는 것이 utf8
* 윈도우에서는 \r\n 으로 개행 윈도우 제외한 운영체제는 \n 으로 개행
* 문자열 스트림에서 버퍼는 라인 단위로 처리
 
데이터 필터 스트림(DataOutputStream, DataInputStream)
* 입력한 그대로 출력할 수 있다. (어느 자료형이든 가능)
* 1byte씩 사용하는 것은 변함이 없다 하지만, 상황에 맞춰서 1byte면 1byte 4byte면 4byte로 입출력
* 반드시 쓰인 순서대로 읽어야 한다 (오류는 일어나지 않음 이상하게 읽힘)
* 객체타입은 안된다 (정확한 단위가 아님) -> 기본 자료형만 가능

바이트 스트림(ByteArrayOutputStream, ByteArrayInputStream)
* 메모리에 파일을 만들어 준다
* 문자열을 한번에 받아서 저장

오브젝트 스트림(ObjectOutputStream, ObjectInputStream)
* ArrayList, Vector 가능
* 객체 직렬화 -> 객체와 관련된 바이너리 값을 나란히 표현하는 것
* 하지만, 객체 데이터에 메서드는 직렬화 대상에 포함하지 않는다
* transient: 직렬화 대상에서 제외 -> 디폴트 값으로 출력