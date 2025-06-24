function App() {
  return (
    <div className="bg-gray-100 min-h-screen text-gray-900 font-sans">
      <header className="bg-indigo-600 text-white p-4">
        <h1 className="text-xl font-bold">Portfolio de Marewane</h1>
      </header>
      <main className="p-6 space-y-4">
        <section>
          <h2 className="text-lg font-semibold">Présentation</h2>
          <p>Je suis étudiant en informatique, passionné par le web et la data...</p>
        </section>
        <section>
          <h2 className="text-lg font-semibold">Projets</h2>
          <p>Projets à venir...</p>
        </section>
        <section>
          <h2 className="text-lg font-semibold">Contact</h2>
          <p>marewane@example.com</p>
        </section>
      </main>
    </div>
  );
}

export default App;
