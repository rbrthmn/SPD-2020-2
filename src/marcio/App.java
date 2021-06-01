package marcio;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
	public static void main(String[] args) throws IOException {
		var lista = leitor(0);
	}

	private static List<RelacaoGuias> leitor(int value) {
		List<RelacaoGuias> lista = new ArrayList<RelacaoGuias>();
		try {
			XStream xstream = new XStream();
//			xstream.processAnnotations(DadosProtocolo.class);
			xstream.addPermission(NoTypePermission.NONE);
			xstream.addPermission(NullPermission.NULL);
			xstream.addPermission(PrimitiveTypePermission.PRIMITIVES);
			xstream.allowTypeHierarchy(Collection.class);
			xstream.allowTypesByWildcard(new String[] {
					"marcio.**"
			});

			xstream.alias("ans:dadosProtocolo", DadosProtocolo.class);
			xstream.aliasField("ans:numeroLotePrestador", DadosProtocolo.class, "numeroLotePrestador");
			xstream.aliasField("ans:numeroProtocolo", DadosProtocolo.class, "numeroProtocolo");
			xstream.aliasField("ans:dataProtocolo", DadosProtocolo.class, "dataProtocolo");
			xstream.aliasField("ans:situacaoProtocolo", DadosProtocolo.class, "situacaoProtocolo");
			xstream.aliasField("ans:valorInformadoProtocolo", DadosProtocolo.class, "valorInformadoProtocolo");
			xstream.aliasField("ans:valorProcessadoProtocolo", DadosProtocolo.class, "valorProcessadoProtocolo");
			xstream.aliasField("ans:valorLiberadoProtocolo", DadosProtocolo.class, "valorLiberadoProtocolo");
			xstream.aliasField("ans:valorGlosaProtocolo", DadosProtocolo.class, "valorGlosaProtocolo");
			xstream.aliasField("ans:relacaoGuias", RelacaoGuias.class, "RelacaoGuias");

			xstream.aliasField("ans:numeroGuiaPrestador", RelacaoGuias.class, "numeroGuiaPrestador");
			xstream.aliasField("ans:numeroGuiaOperadora", RelacaoGuias.class, "numeroGuiaOperadora");
			xstream.aliasField("ans:senha", RelacaoGuias.class, "senha");
			xstream.aliasField("ans:nomeBeneficiario", RelacaoGuias.class, "nomeBeneficiario");
			xstream.aliasField("ans:numeroCarteira", RelacaoGuias.class, "numeroCarteira");
			xstream.aliasField("ans:dataInicioFat", RelacaoGuias.class, "dataInicioFat");
			xstream.aliasField("ans:dataFimFat", RelacaoGuias.class, "dataFimFat");
			xstream.aliasField("ans:horaFimFat", RelacaoGuias.class, "horaFimFat");
			xstream.aliasField("ans:situacaoGuia", RelacaoGuias.class, "situacaoGuia");
			xstream.aliasField("ans:valorInformadoGuia", RelacaoGuias.class, "valorInformadoGuia");
			xstream.aliasField("ans:valorProcessadoGuia", RelacaoGuias.class, "valorProcessadoGuia");
			xstream.aliasField("ans:valorLiberadoGuia", RelacaoGuias.class, "valorLiberadoGuia");
			xstream.aliasField("ans:valorGlosaGuia", RelacaoGuias.class, "valorGlosaGuia");

//			String filename = "src/marcio.xml";
//			File file = new File(filename);
//
//			SROXML minhaBusca = (SROXML) xstream.fromXML(new FileInputStream(file));
			FileReader arquivo = new FileReader("src/teste.txt");
			BufferedReader ler = new BufferedReader(arquivo);

			String xml = ler.lines().collect(Collectors.joining());
			DadosProtocolo dados = (DadosProtocolo) xstream.fromXML(xml);

			for (Object relacaoGuias :
				 dados.getRelacaoGuias()) {
				System.out.println(relacaoGuias.getClass().getName());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo não encontrado!");

		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
