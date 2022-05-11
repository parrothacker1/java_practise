class HelloWorld
  @@name="none"
  def initialize(name)
    @@name=name
  end
  def show_name
    puts "The name is #@@name"
  end
end

HelloWorld.new("parrothacker1").show_name
