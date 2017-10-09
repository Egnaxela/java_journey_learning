package com.rongji.asciimg;

import com.rongji.asciimg.image.AsciiImgCache;
import com.rongji.asciimg.image.character_fit_strategy.BestCharacterFitStrategy;
import com.rongji.asciimg.image.character_fit_strategy.StructuralSimilarityFitStrategy;
import com.rongji.asciimg.image.converter.AsciiToImageConverter;
import com.rongji.asciimg.image.converter.GifToAsciiConvert;
import com.rongji.asciimg.utils.AnimatedGifEncoder;
import com.rongji.asciimg.utils.GifDecoder;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class GifExamples {

	public static void main(String[] args) throws IOException {

		// initialize caches
		AsciiImgCache smallFontCache = AsciiImgCache.create(new Font("Courier",Font.BOLD, 6));
		// initialize ssimStrategy
		BestCharacterFitStrategy ssimStrategy = new StructuralSimilarityFitStrategy();
		
		String srcFilePath = "examples/test.gif";
		String disFilePath = "examples/test-ascii.gif";
		int delay = 100;//ms
		
		GifToAsciiConvert asciiConvert = new GifToAsciiConvert(smallFontCache, ssimStrategy);
		
		asciiConvert.convertGitToAscii(srcFilePath, disFilePath, delay,0);
	}
}
