SUMMARY = "Traitlets Python config system"
HOMEPAGE = "http://ipython.org"
AUTHOR = "IPython Development Team <ipython-dev@scipy.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13bed0ee6f46a6f6dbf1f9f9572f250a"

SRC_URI[sha256sum] = "f584ea209240466e66e91f3c81aa7d004ba4cf794990b0c775938a1544217cd1"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-ipython-genutils \
    ${PYTHON_PN}-decorator \
"

BBCLASSEXTEND = "native nativesdk"