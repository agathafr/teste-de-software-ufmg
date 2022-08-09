@Test
public void testRepeat() {
    String input = "20";

    assertEquals ("", Strings.repeat(input, 0));
    assertEquals ("20", Strings.repeat(input, 1));
    assertEquals ("2020", Strings.repeat(input, 2));
    assertEquals ("202020", Strings.repeat(input, 3));
}