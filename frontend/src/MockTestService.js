const BASE_URL = '/api/mocktests';

export async function getAllTests() {
  const res = await fetch(BASE_URL);
  return res.json();
}

export async function getTestById(id) {
  const res = await fetch(`${BASE_URL}/${id}`);
  return res.json();
}

export async function createTest(test) {
  const res = await fetch(BASE_URL, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(test)
  });
  return res.json();
}

export async function updateTest(id, test) {
  const res = await fetch(`${BASE_URL}/${id}`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(test)
  });
  return res.json();
}

export async function deleteTest(id) {
  const res = await fetch(`${BASE_URL}/${id}`, { method: 'DELETE' });
  return res.text(); // your endpoint returns a plain string
}