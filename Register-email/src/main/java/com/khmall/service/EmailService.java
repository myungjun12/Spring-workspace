package com.khmall.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //@Autowired = 클래스 안에 변수마다 하나씩 설정
//@RequiredArgsConstructor는 @Autowired 와 같지만 내부에서 하나씩 하나씩 해주는 것이 아니라 외부에서 전체적으로 설정
//@Autowired spring에서 만들어서 이름이 Autowired // lombok에서 만들어서 이름이 구체적으로 @RequiredArgsConstructor
public class EmailService {
	
	// 자바 자체에서 제공하는 이메일 보내기 기능 틀
	// 왜 틀만 제공하냐면 이메일을 전송하는데 어느회사 어느규격 이메일인지 알 수 없기 때문에
	// 이메일을 보낼 때 보내는이 내용 받는이
	private final JavaMailSender javaMailSender;
	
	private static final String senderEmail = "nenncmj@gmail.com"; //이메일을 보낼 담당자 이메일 작성
	//application.properties에서 가져온 이메일을 그대로 사용
	private static int number; //  인증번호를 보낼 숫자 공간
	
	//랜덤으로 인증번호 생성하는 메서드(기능 = 동작) 설정
	//임의로 6자리를 생성하는 규칙
	public static void 번호생성() {
		number = (int)(Math.random() * (90000)) + 100000;
	}
	
	//메일 양식 작성
	public MimeMessage createMail(String mail) {
		//인증번호 생성
		번호생성();
		//생성된 인증번호를 담는 변수 
		MimeMessage 메세지 = javaMailSender.createMimeMessage();
		// MimeMessage 이메일 본문 담당! 첨부파일 헤더 첨부파일 헤더 같이 보낼 수 있음
		// 자바에서 제공하는 기능
		//메세지 보낼 공간 생성
		
		try {
			메세지.setFrom(senderEmail);//인증번호를 전송하는 주최자 이메일 주소 
			메세지.setRecipients(MimeMessage.RecipientType.TO, mail); //-> String 타입
			//메세지.setRecipient(MimeMessage.RecipientType.TO, mail); -> address타입
			//태그로 img src 이미지 같이 보낼 수 있음
			//첨부파일 참조하는 태그들 이용해서 같이 보낼 수 있음
			메세지.setSubject("이메일 인증"); //보내는 제목
			String 이메일본문 = "";
			이메일본문 += "<h3>" + "요청하신 인증 번호입니다." + "</h3>";
			이메일본문 += "<h1>" + number + "</h1>";
			메세지.setText(이메일본문, "utf-8","html");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		return 메세지; //메세지. 으로 작성한 모든 내용 담아서 전달하기
	}
	
	public int sendMail(String mail) {
		MimeMessage 메세지 = createMail(mail);
		javaMailSender.send(메세지);
		return number;
	}
}




















