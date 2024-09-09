package ch04_syntax_ex_sol.solutions;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise04_TextBlocks
{
    public static void main(final String[] args)
    {
        String multiLineString = """
                        THIS IS
                        A MULTI
                        LINE STRING
                        WITH A BACKSLASH \\
                        """;
        System.out.println(multiLineString);

        String multiLineHtml = """
                        <html>
                            <body>
                                <p>Hello, world</p>
                            </body>
                        </html>""";
        System.out.println(multiLineHtml);

        String jsonTextBlock = """
                        {
                            "version": "Java17",
                            "feature": "text blocks",
                            "attention": "very cool!"
                        }
                        """;
        System.out.println(jsonTextBlock);
    }

    private static void oldStyle()
    {
        String multiLineStringOld = "THIS IS\n" + "A MULTI\n" + "LINE STRING\n" + "WITH A BACKSLASH \\\n";
        System.out.println(multiLineStringOld);

        String multiLineHtmlOld = "<html>\n" + "    <body>\n" + "        <p>Hello, world</p>\n" + "    </body>\n"
                                  + "</html>";
        System.out.println(multiLineHtmlOld);

        String jsonOld = "{\n" + "    \"version\": \"Java 17\",\n" + "    \"feature\": \"text blocks\",\n"
                         + "    \"attention\": \"very cool!\"\n" + "}\n";
        System.out.println(jsonOld);
    }
}
