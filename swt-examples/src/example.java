class example {

static String [][] names = {
    {"text", "org.eclipse.swt.examples.texteditor.TextEditor", },
    {"paint", "org.eclipse.swt.examples.paint.PaintExample", },
    {"layout", "org.eclipse.swt.examples.layoutexample.LayoutExample", },
    {"javaview", "org.eclipse.swt.examples.javaviewer.JavaViewer", },
    {"image", "org.eclipse.swt.examples.imageanalyzer.ImageAnalyzer", },
    {"hoverhelp", "org.eclipse.swt.examples.hoverhelp.HoverHelp", },
    {"helllo5", "org.eclipse.swt.examples.helloworld.HelloWorld5", },
    {"helllo4", "org.eclipse.swt.examples.helloworld.HelloWorld4", },
    {"helllo3", "org.eclipse.swt.examples.helloworld.HelloWorld3", },
    {"helllo2", "org.eclipse.swt.examples.helloworld.HelloWorld2", },
    {"helllo", "org.eclipse.swt.examples.helloworld.HelloWorld", },
    {"graphics", "org.eclipse.swt.examples.texteditor.GraphicsExample", },
    {"file", "org.eclipse.swt.examples.fileviewer.FileViewer", },
    {"dnd", "org.eclipse.swt.examples.dnd.DNDExample", },
    {"ctrl", "org.eclipse.swt.examples.controlexample.ControlExample", },
    {"custom", "org.eclipse.swt.examples.controlexample.CustomControlExample", },
    {"clip", "org.eclipse.swt.examples.clipboard.ClipboardExample", },
    {"browser", "org.eclipse.swt.examples.browserexample.BrowserExample", },
    {"addressbook", "org.eclipse.swt.examples.addressbook.AddressBook", },
};

static void tlog(String msg) { System.out.println(msg); }

public static void main(String[] args) throws Exception {
if (args.length <= 0) {
    for (int i = 0; i < names.length; i++) {
        tlog(names[i][0] + "\t" + names[i][1]);
    }
    return;
}
String cmd = args[0];
for (int i = 0; i < names.length; i++) {
    if (!cmd.equalsIgnoreCase(names[i][0])) continue;

    String ag[] = new String[args.length -1];
    System.arraycopy(args, 1, ag, 0, args.length -1);
    Class cls = Class.forName(names[i][1]);
    cls.getMethod("main", new Class[]{ args.getClass()}).
        invoke(null, new Object[]{ag});
    return;
}}}

