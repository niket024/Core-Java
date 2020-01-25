import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class Employee implements Externalizable
{
	private String name;
	private int age;
	private double weignt;

	public Employee()
	{

	}

	public Employee(String name, int age, double weight)
	{
		this.name = name;
		this.age = age;
		this.weignt = weight;
	}

	@Override
	public String toString()
	{
		return "name=" + name + ",age=" + age + ",weight=" + weignt;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeUTF(name);
		out.writeInt(age);
		out.writeDouble(weignt);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		name = in.readUTF();
		age = in.readInt();
		weignt = in.readDouble();

	}
}