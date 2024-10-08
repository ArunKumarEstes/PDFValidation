package PDF;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFvalidation {

	public static void main(String[] args) throws IOException {

	
		PDDocument pdf = PDDocument.load(new File ("C:\\Users\\kumarar\\eclipse-workspace\\PdfValidation\\PDFfolder\\Mobile App Attendance workflow - ASPIRE.pdf"));

		PDFTextStripper text = new PDFTextStripper();
		
		text.getText(pdf);

		String pdf_print = text.getText(pdf);

		
		
		text.setStartPage(2);
		text.setEndPage(5);
		System.out.println(pdf_print);

	}

}
